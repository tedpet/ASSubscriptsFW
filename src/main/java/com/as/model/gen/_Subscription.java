// DO NOT EDIT.  Make changes to com.as.model.Subscription.java instead.
package com.as.model.gen;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

import er.extensions.eof.*;
import er.extensions.foundation.*;

@SuppressWarnings("all")
public abstract class _Subscription extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "Subscription";

  // Attribute Keys
  public static final ERXKey<NSTimestamp> DATE_SUBSCRIBED = new ERXKey<NSTimestamp>("dateSubscribed");
  public static final ERXKey<String> EMAIL_ACCOUNT = new ERXKey<String>("emailAccount");
  public static final ERXKey<Boolean> RETIRED = new ERXKey<Boolean>("retired");
  public static final ERXKey<String> SUB_ID = new ERXKey<String>("subID");
  public static final ERXKey<String> SUB_PASSWORD = new ERXKey<String>("subPassword");
  public static final ERXKey<String> SUBSCRPTION_NAME = new ERXKey<String>("subscrptionName");
  // Relationship Keys
  public static final ERXKey<com.as.model.Person> PERSON = new ERXKey<com.as.model.Person>("person");

  // Attributes
  public static final String DATE_SUBSCRIBED_KEY = DATE_SUBSCRIBED.key();
  public static final String EMAIL_ACCOUNT_KEY = EMAIL_ACCOUNT.key();
  public static final String RETIRED_KEY = RETIRED.key();
  public static final String SUB_ID_KEY = SUB_ID.key();
  public static final String SUB_PASSWORD_KEY = SUB_PASSWORD.key();
  public static final String SUBSCRPTION_NAME_KEY = SUBSCRPTION_NAME.key();
  // Relationships
  public static final String PERSON_KEY = PERSON.key();

  private static Logger LOG = Logger.getLogger(_Subscription.class);

  public com.as.model.Subscription localInstanceIn(EOEditingContext editingContext) {
    com.as.model.Subscription localInstance = (com.as.model.Subscription)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public NSTimestamp dateSubscribed() {
    return (NSTimestamp) storedValueForKey(_Subscription.DATE_SUBSCRIBED_KEY);
  }

  public void setDateSubscribed(NSTimestamp value) {
    if (_Subscription.LOG.isDebugEnabled()) {
    	_Subscription.LOG.debug( "updating dateSubscribed from " + dateSubscribed() + " to " + value);
    }
    takeStoredValueForKey(value, _Subscription.DATE_SUBSCRIBED_KEY);
  }

  public String emailAccount() {
    return (String) storedValueForKey(_Subscription.EMAIL_ACCOUNT_KEY);
  }

  public void setEmailAccount(String value) {
    if (_Subscription.LOG.isDebugEnabled()) {
    	_Subscription.LOG.debug( "updating emailAccount from " + emailAccount() + " to " + value);
    }
    takeStoredValueForKey(value, _Subscription.EMAIL_ACCOUNT_KEY);
  }

  public Boolean retired() {
    return (Boolean) storedValueForKey(_Subscription.RETIRED_KEY);
  }

  public void setRetired(Boolean value) {
    if (_Subscription.LOG.isDebugEnabled()) {
    	_Subscription.LOG.debug( "updating retired from " + retired() + " to " + value);
    }
    takeStoredValueForKey(value, _Subscription.RETIRED_KEY);
  }

  public String subID() {
    return (String) storedValueForKey(_Subscription.SUB_ID_KEY);
  }

  public void setSubID(String value) {
    if (_Subscription.LOG.isDebugEnabled()) {
    	_Subscription.LOG.debug( "updating subID from " + subID() + " to " + value);
    }
    takeStoredValueForKey(value, _Subscription.SUB_ID_KEY);
  }

  public String subPassword() {
    return (String) storedValueForKey(_Subscription.SUB_PASSWORD_KEY);
  }

  public void setSubPassword(String value) {
    if (_Subscription.LOG.isDebugEnabled()) {
    	_Subscription.LOG.debug( "updating subPassword from " + subPassword() + " to " + value);
    }
    takeStoredValueForKey(value, _Subscription.SUB_PASSWORD_KEY);
  }

  public String subscrptionName() {
    return (String) storedValueForKey(_Subscription.SUBSCRPTION_NAME_KEY);
  }

  public void setSubscrptionName(String value) {
    if (_Subscription.LOG.isDebugEnabled()) {
    	_Subscription.LOG.debug( "updating subscrptionName from " + subscrptionName() + " to " + value);
    }
    takeStoredValueForKey(value, _Subscription.SUBSCRPTION_NAME_KEY);
  }

  public com.as.model.Person person() {
    return (com.as.model.Person)storedValueForKey(_Subscription.PERSON_KEY);
  }
  
  public void setPerson(com.as.model.Person value) {
    takeStoredValueForKey(value, _Subscription.PERSON_KEY);
  }

  public void setPersonRelationship(com.as.model.Person value) {
    if (_Subscription.LOG.isDebugEnabled()) {
      _Subscription.LOG.debug("updating person from " + person() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setPerson(value);
    }
    else if (value == null) {
    	com.as.model.Person oldValue = person();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _Subscription.PERSON_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _Subscription.PERSON_KEY);
    }
  }
  

  public static com.as.model.Subscription createSubscription(EOEditingContext editingContext, NSTimestamp dateSubscribed
, String emailAccount
, Boolean retired
, String subID
, String subPassword
, String subscrptionName
, com.as.model.Person person) {
    com.as.model.Subscription eo = (com.as.model.Subscription) EOUtilities.createAndInsertInstance(editingContext, _Subscription.ENTITY_NAME);    
		eo.setDateSubscribed(dateSubscribed);
		eo.setEmailAccount(emailAccount);
		eo.setRetired(retired);
		eo.setSubID(subID);
		eo.setSubPassword(subPassword);
		eo.setSubscrptionName(subscrptionName);
    eo.setPersonRelationship(person);
    return eo;
  }

  public static ERXFetchSpecification<com.as.model.Subscription> fetchSpec() {
    return new ERXFetchSpecification<com.as.model.Subscription>(_Subscription.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<com.as.model.Subscription> fetchAllSubscriptions(EOEditingContext editingContext) {
    return _Subscription.fetchAllSubscriptions(editingContext, null);
  }

  public static NSArray<com.as.model.Subscription> fetchAllSubscriptions(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Subscription.fetchSubscriptions(editingContext, null, sortOrderings);
  }

  public static NSArray<com.as.model.Subscription> fetchSubscriptions(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<com.as.model.Subscription> fetchSpec = new ERXFetchSpecification<com.as.model.Subscription>(_Subscription.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<com.as.model.Subscription> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static com.as.model.Subscription fetchSubscription(EOEditingContext editingContext, String keyName, Object value) {
    return _Subscription.fetchSubscription(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static com.as.model.Subscription fetchSubscription(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<com.as.model.Subscription> eoObjects = _Subscription.fetchSubscriptions(editingContext, qualifier, null);
    com.as.model.Subscription eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Subscription that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static com.as.model.Subscription fetchRequiredSubscription(EOEditingContext editingContext, String keyName, Object value) {
    return _Subscription.fetchRequiredSubscription(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static com.as.model.Subscription fetchRequiredSubscription(EOEditingContext editingContext, EOQualifier qualifier) {
    com.as.model.Subscription eoObject = _Subscription.fetchSubscription(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Subscription that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static com.as.model.Subscription localInstanceIn(EOEditingContext editingContext, com.as.model.Subscription eo) {
    com.as.model.Subscription localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }

}
