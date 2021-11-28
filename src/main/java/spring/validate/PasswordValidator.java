package spring.validate;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class PasswordValidator implements Validator {
	
	@Autowired
	private MessageSource messageSource;

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}

	@Override
	public void validate(Object target, Errors errors) {

	}

	public void validate(String password, Errors errors) {
		if (password.equals("")) {
			errors.rejectValue("password", null, messageSource.getMessage("NotEmpty.error.password", null, Locale.getDefault()));
		}
	}

}
