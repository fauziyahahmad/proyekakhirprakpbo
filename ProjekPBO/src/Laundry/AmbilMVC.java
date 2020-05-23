package Laundry;

public class AmbilMVC {
	AmbilView ambilview = new AmbilView();
	AmbilModel ambilmodel = new AmbilModel();
	AmbilDAO ambildao = new AmbilDAO();
	AmbilController ambilcontroller = new AmbilController(ambilmodel, ambilview, ambildao);
}
