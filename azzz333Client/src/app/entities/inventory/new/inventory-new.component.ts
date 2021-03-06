import { Component, OnInit, Inject } from '@angular/core';
import { ActivatedRoute,Router} from "@angular/router";
import { FormBuilder, Validators} from '@angular/forms';
import { MatDialogRef, MatDialog, MAT_DIALOG_DATA } from '@angular/material/dialog';

import { InventoryService } from '../inventory.service';
import { IInventory } from '../iinventory';
import { Globals, BaseNewComponent, PickerDialogService, ErrorService } from 'src/app/common/shared';
import { GlobalPermissionService } from 'src/app/core/global-permission.service';

import { FilmService } from 'src/app/entities/film/film.service';

@Component({
  selector: 'app-inventory-new',
  templateUrl: './inventory-new.component.html',
  styleUrls: ['./inventory-new.component.scss']
})
export class InventoryNewComponent extends BaseNewComponent<IInventory> implements OnInit {
  
    title:string = "New Inventory";
	constructor(
		public formBuilder: FormBuilder,
		public router: Router,
		public route: ActivatedRoute,
		public dialog: MatDialog,
		public dialogRef: MatDialogRef<InventoryNewComponent>,
		@Inject(MAT_DIALOG_DATA) public data: any,
		public global: Globals,
		public pickerDialogService: PickerDialogService,
		public inventoryService: InventoryService,
		public errorService: ErrorService,
		public filmService: FilmService,
		public globalPermissionService: GlobalPermissionService,
	) {
		super(formBuilder, router, route, dialog, dialogRef, data, global, pickerDialogService, inventoryService, errorService);
	}
 
	ngOnInit() {
		this.entityName = 'Inventory';
		this.setAssociations();
		super.ngOnInit();
    	this.setForm();
		this.checkPassedData();
		this.setPickerSearchListener();
    }
 		
	setForm(){
 		this.itemForm = this.formBuilder.group({
      inventoryId: ['', Validators.required],
      lastUpdate: ['', Validators.required],
	  lastUpdateTime: ['12:00 AM', Validators.required],
      storeId: [''],
      filmId: ['', Validators.required],
      filmDescriptiveField: ['', Validators.required],
    });
    
    this.fields = [
      {
		name: 'inventoryId',
		label: 'inventory Id',
		isRequired: true,
		isAutoGenerated: false,
	      type: 'number',
	    },
      {
		name: 'lastUpdate',
		label: 'last Update',
		isRequired: true,
		isAutoGenerated: false,
		    type: 'date',
		  },
		  {
				name: 'lastUpdateTime',
				label: 'last Update Time',
				isRequired: true,
				isAutoGenerated: false,
				type: 'time'
	    },
      {
		name: 'storeId',
		label: 'store Id',
		isRequired: false,
		isAutoGenerated: false,
	      type: 'number',
	    },
		];
	}
	 
	setAssociations(){
  	
		this.associations = [
			{
				column: [
					{
						key: 'filmId',
						value: undefined,
						referencedkey: 'filmId'
					},
					  
				],
				isParent: false,
				table: 'film',
				type: 'ManyToOne',
				service: this.filmService,
				label: 'film',
				descriptiveField: 'filmDescriptiveField',
				referencedDescriptiveField: 'filmId',
		    
			},
		];
		this.parentAssociations = this.associations.filter(association => {
			return (!association.isParent);
		});

	}
	
	onSubmit() {
		let inventory = this.itemForm.getRawValue();
	    inventory.lastUpdate = this.dataService.combineDateAndTime(inventory.lastUpdate, inventory.lastUpdateTime);
	    delete inventory.lastUpdateTime;
		super.onSubmit(inventory);
		
	}
    
}
