package com.fastcode.azzz333.application.extended.payment;

import org.springframework.stereotype.Service;
import com.fastcode.azzz333.application.core.payment.PaymentAppService;

import com.fastcode.azzz333.domain.extended.payment.IPaymentRepositoryExtended;
import com.fastcode.azzz333.domain.extended.customer.ICustomerRepositoryExtended;
import com.fastcode.azzz333.domain.extended.rental.IRentalRepositoryExtended;
import com.fastcode.azzz333.domain.extended.staff.IStaffRepositoryExtended;
import com.fastcode.azzz333.commons.logging.LoggingHelper;

@Service("paymentAppServiceExtended")
public class PaymentAppServiceExtended extends PaymentAppService implements IPaymentAppServiceExtended {

	public PaymentAppServiceExtended(IPaymentRepositoryExtended paymentRepositoryExtended,
				ICustomerRepositoryExtended customerRepositoryExtended,IRentalRepositoryExtended rentalRepositoryExtended,IStaffRepositoryExtended staffRepositoryExtended,IPaymentMapperExtended mapper,LoggingHelper logHelper) {

		super(paymentRepositoryExtended,
		customerRepositoryExtended,rentalRepositoryExtended,staffRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

