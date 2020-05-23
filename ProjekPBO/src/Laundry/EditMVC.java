package Laundry;

public class EditMVC {
	EditView editview = new EditView();
	EditModel editmodel = new EditModel();
	EditDAO editdao = new EditDAO();
	EditController editcontroller = new EditController(editmodel, editview, editdao);
}
