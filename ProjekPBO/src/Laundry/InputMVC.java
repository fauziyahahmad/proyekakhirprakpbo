
package Laundry;

public class InputMVC {
    InputView inputview = new InputView();
    InputModel inputmodel = new InputModel();
    InputDAO inputdao = new InputDAO();
    InputController inputcontroller = new InputController(inputmodel, inputview, inputdao);
}
