
package Laundry;

public class LaundryMVC {
    LaundryView laundryview = new LaundryView();
    LaundryModel laundrymodel = new LaundryModel();
    LaundryDAO laundrydao = new LaundryDAO();
    LaundryController laundrycontroller = new LaundryController(laundrymodel, laundryview, laundrydao);
}
