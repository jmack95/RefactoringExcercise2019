import javax.swing.JComboBox;
import javax.swing.JTextField;

public class Validator {
public void validation() {
		
	}
	
	public static boolean validate(JTextField ppsField, JTextField surnameField, JTextField firstNameField, JComboBox<String> genderCombo, JComboBox<String> departmentCombo) {
		boolean valid = true;
		EmployeeDetails ed = new EmployeeDetails();
		if (ppsField.isEditable() && ppsField.getText().trim().isEmpty()) {
			ppsField.setBackground(ColourOption.red);
			valid = false;
		}  
		if (surnameField.isEditable() && surnameField.getText().trim().isEmpty()) {
			surnameField.setBackground(ColourOption.red);
			valid = false;
		} 
		if (firstNameField.isEditable() && firstNameField.getText().trim().isEmpty()) {
			firstNameField.setBackground(ColourOption.red);
			valid = false;
		}
		if (genderCombo.getSelectedIndex() == 0 && genderCombo.isEnabled()) {
			genderCombo.setBackground(ColourOption.red);
			valid = false;
		} 
		if (departmentCombo.getSelectedIndex() == 0 && departmentCombo.isEnabled()) {
			departmentCombo.setBackground(ColourOption.red);
			valid = false;
		} 
		return valid;
	}

}
