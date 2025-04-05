class LeapYear{
public static void main(String[]args){

int year = 1976;

if((year % 4 == 0 && year % 400 !=0) || (year % 100 == 0)){
System.out.println("leap year");
}

 {System.out.println("Not a leap year");
}

}
}