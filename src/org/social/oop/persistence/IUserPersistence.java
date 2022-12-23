package org.social.oop.persistence;

import org.social.oop.exception.EmailNotRegisteredException;
import org.social.oop.exception.EmailNotValidException;
import org.social.oop.exception.EmailFieldNotFilledException;
import org.social.oop.exception.NameFieldNotFilledException;
import org.social.oop.exception.PasswordConfirmationDoesNotMatchException;
import org.social.oop.exception.PasswordDoNotMatchException;
import org.social.oop.exception.PasswordFieldNotFilledException;
import org.social.oop.exception.PasswordInvalidException;
import org.social.oop.exception.PhoneFieldNotFilledException;
import org.social.oop.model.User;

public interface IUserPersistence {
	
		public void createUser(User user) throws EmailFieldNotFilledException, NameFieldNotFilledException, PhoneFieldNotFilledException, PasswordFieldNotFilledException, PasswordConfirmationDoesNotMatchException, EmailNotValidException, PasswordInvalidException;
		
		public User locateUser(User user);
		
		public void removeUser(User user);
		
		public void updateUser(User user);
		
		public boolean authUser(User user) throws EmailNotRegisteredException, EmailFieldNotFilledException, PasswordDoNotMatchException;
		
}
