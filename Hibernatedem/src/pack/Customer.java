package pack;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue(value="c")
public class Customer extends Person {
	private String bankName;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int uid, String name, String bankName) {
		super(uid, name);
		this.bankName = bankName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	

}
