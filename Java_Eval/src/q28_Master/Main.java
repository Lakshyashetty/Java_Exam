package q28_Master;

import q28_dev.Dev1;
import q28_dev.Dev2;
import q28_dev.Dev3;
import q28_dev.Dev4;

public class Main {
public static void main(String[] args) {
	Dev1 dev1=new Dev1();
	dev1.InsertData();
	Dev2 dev2=new Dev2();
	dev2.UpdateData();
	Dev3 dev3=new Dev3();
    dev3.DeleteData();
	Dev4 dev4=new Dev4();
	dev4.showData();
}
}
