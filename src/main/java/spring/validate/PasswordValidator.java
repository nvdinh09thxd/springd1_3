package spring.validate;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class PasswordValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}

	@Override
	public void validate(Object target, Errors errors) {
		
	}

	public void validate(String password, Errors errors) {
		if (password.equals("")) {
			errors.rejectValue("password", null, "password không được để trống!");
		}
	}
	
}
