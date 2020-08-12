package com.techproed.utilities;

import com.techproed.pages.FHCLoginPage1;
import com.techproed.pages.FHCReservationPage;
import com.techproed.pages.FhcLoginPage;

public class ObjectPages {

    private FhcLoginPage fhcLoginPage;
    private FHCReservationPage fhcReservationPage;
    private FHCLoginPage1 fhcLoginPage1;

    public FhcLoginPage fhcLogin() {
        if (fhcLoginPage == null) {
            fhcLoginPage = new FhcLoginPage(Driver.getDriver());
        }
        return fhcLoginPage;
    }
}
