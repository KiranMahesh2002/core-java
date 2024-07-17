class TeaShopRunner{

public static void main(String[] tea){



boolean addTea = TeaShop.addTeaName("Ginger Tea");
System.out.println(addTea);
boolean addPrice = TeaShop.addTeaPrice(15.0);
System.out.println(addPrice);


 addTea = TeaShop.addTeaName("Lemon Tea");
 addPrice = TeaShop.addTeaPrice(20.0);
System.out.println(addTea);

System.out.println(addPrice);

 addTea = TeaShop.addTeaName("Masala Tea");
System.out.println(addTea);
addPrice = TeaShop.addTeaPrice(20.0);
System.out.println(addPrice);

 addTea = TeaShop.addTeaName("Pudina Tea");
System.out.println(addTea); 
addPrice = TeaShop.addTeaPrice(25.0);
System.out.println(addPrice);

addTea = TeaShop.addTeaName("Tulsi Tea");
System.out.println(addTea);
addPrice = TeaShop.addTeaPrice(15.0);
System.out.println(addPrice);

addTea = TeaShop.addTeaName("hybiscus Tea");
System.out.println(addTea);
addPrice = TeaShop.addTeaPrice(15.0);
System.out.println(addPrice);

addTea = TeaShop.addTeaName("Normal Tea");
System.out.println(addTea);

TeaShop.getShopDetails();
TeaShop.getTeaName();
TeaShop.getTeaPrice();

 boolean update = TeaShop.updateTeaName("Tulsi Tea","Pepper Tea");
 System.out.println(update);
 
TeaShop.getTeaName();
}



}