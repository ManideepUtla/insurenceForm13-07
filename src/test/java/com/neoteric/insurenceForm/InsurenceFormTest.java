package com.neoteric.insurenceForm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InsurenceFormTest {
    @Test
    public void insurenceForm(){
        MotorInsurence motorInsurence=new MotorInsurence();
        motorInsurence.policyNo="2113141";
        motorInsurence.claimNo="2141424";
        motorInsurence.vehicleNo="TG DE 324";


        InsuredDetails insuredDetails=new InsuredDetails();
        insuredDetails.name="xxxxx";
        Address address=new Address();
        insuredDetails.address1=address;
        insuredDetails.city="hyd";
        insuredDetails.pin="500032";
        insuredDetails.mobileNo="8986756463";
        insuredDetails.email="xxxxxxxxxxx@gmail.com";

        LossDetails lossDetails=new LossDetails();

        lossDetails.dateAndTimeOfIncident="date";

        TypeOfLoss losstype=new TypeOfLoss();

        lossDetails.typeOfLoss= losstype;//linked line

        losstype.owndamage=false;
        losstype.theft=true;
        losstype.thirdParty=false;

        lossDetails.shortDiscriptionOfAccident="xxxx";


        DriverDetails driverDetails=new DriverDetails();
        driverDetails.name="xxxx";
        driverDetails.age=00;
        driverDetails.drivingLicenseNo="xxxxx";
        driverDetails.learnersLicense=true;
        driverDetails.coPassengerDetails="xxxxxx";

        motorInsurence.insuredDetails=insuredDetails;
        motorInsurence.lossDetails=lossDetails;
        motorInsurence.driverDetails=driverDetails;


        Assertions.assertNotNull(motorInsurence.insuredDetails);
        Assertions.assertNotNull(motorInsurence.lossDetails);
        Assertions.assertNotNull(motorInsurence.driverDetails);

    }
}
