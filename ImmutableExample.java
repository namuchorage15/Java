public class ImmutableExample{
    String name;
    ImmutableExample(String name) {
    this.name = name;
}
         String newName() {
         return name;
}   
         
public static void main(String[] args) {
ImmutableExample obj = new ImmutableExample("hi");
System.out.println(obj.newName());
}
}
