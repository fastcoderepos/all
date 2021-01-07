import { Component, OnInit, Inject } from '@angular/core';
import { ActivatedRoute,Router} from "@angular/router";
import { FormBuilder, Validators} from '@angular/forms';
import { MatDialogRef, MatDialog, MAT_DIALOG_DATA } from '@angular/material/dialog';

import { PermissionService } from '../permission.service';
import { IPermission } from '../ipermission';
import { Globals, BaseNewComponent, PickerDialogService, ErrorService } from 'src/app/common/shared';
import { GlobalPermissionService } from 'src/app/core/global-permission.service';


@Component({
  selector: 'app-permission-new',
  templateUrl: './permission-new.component.html',
  styleUrls: ['./permission-new.component.scss']
})
export class PermissionNewComponent extends BaseNewComponent<IPermission> implements OnInit {
  
    title:string = "New Permission";
	constructor(
		public formBuilder: FormBuilder,
		public router: Router,
		public route: ActivatedRoute,
		public dialog: MatDialog,
		public dialogRef: MatDialogRef<PermissionNewComponent>,
		@Inject(MAT_DIALOG_DATA) public data: any,
		public global: Globals,
		public pickerDialogService: PickerDialogService,
		public permissionService: PermissionService,
		public errorService: ErrorService,
		public globalPermissionService: GlobalPermissionService,
	) {
		super(formBuilder, router, route, dialog, dialogRef, data, global, pickerDialogService, permissionService, errorService);
	}
 
	ngOnInit() {
		this.entityName = 'Permission';
		this.setAssociations();
		super.ngOnInit();
    	this.setForm();
		this.checkPassedData();
		this.setPickerSearchListener();
    }
 		
	setForm(){
 		this.itemForm = this.formBuilder.group({
      displayName: ['', Validators.required],
      name: ['', Validators.required],
    });
    
    this.fields = [
      {
		name: 'displayName',
		label: 'display Name',
		isRequired: true,
		isAutoGenerated: false,
	      type: 'string',
	    },
      {
		name: 'id',
		label: 'id',
		isRequired: true,
		isAutoGenerated: true,
	      type: 'number',
	    },
      {
		name: 'name',
		label: 'name',
		isRequired: true,
		isAutoGenerated: false,
	      type: 'string',
	    },
		];
	}
	 
	setAssociations(){
  	
		this.associations = [
		];
		this.parentAssociations = this.associations.filter(association => {
			return (!association.isParent);
		});

	}
	
	onSubmit() {
		let permission = this.itemForm.getRawValue();
		super.onSubmit(permission);
		
	}
    
}
