package q2_withUi;

public class Pojo {
private String name;
private  int Id;
private String contact ;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
@Override
public String toString() {
	return "Pojo [name=" + name + ", Id=" + Id + ", contact=" + contact + "]";
}



}
