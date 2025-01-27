package encapsulation;

public class Bank1 {
private int pin;

public int getPin() {
	return pin;
}

public void setPin(int pin) {
	this.pin = pin;
}

void validate(int pin) {
	if(pin==1001||pin==1234||pin==1212) {
		System.out.println("pin validated successfully");}
	else {System.out.println("Incorrect pin");
	}}
}

