// DO NOT EDIT.  Make changes to com.as.model.Person.java instead.
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
public abstract class _Person extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "Person";

  // Attribute Keys
  public static final ERXKey<String> FIRST_NAME = new ERXKey<String>("firstName");
  public static final ERXKey<String> LAST_NAME = new ERXKey<String>("lastName");
  public static final ERXKey<String> LOGIN = new ERXKey<String>("login");
  public static final ERXKey<String> PASSWORD = new ERXKey<String>("password");
  // Relationship Keys
  public static final ERXKey<com.as.model.Permissions> PERMISSIONS = new ERXKey<com.as.model.Permissions>("permissions");
  public static final ERXKey<com.as.model.Subscription> SUBSCRIPTIONS = new ERXKey<com.as.model.Subscription>("subscriptions");

  // Attributes
  public static final String FIRST_NAME_KEY = FIRST_NAME.key();
  public static final String LAST_NAME_KEY = LAST_NAME.key();
  public static final String LOGIN_KEY = LOGIN.key();
  public static final String PASSWORD_KEY = PASSWORD.key();
  // Relationships
  public static final String PERMISSIONS_KEY = PERMISSIONS.key();
  public static final String SUBSCRIPTIONS_KEY = SUBSCRIPTIONS.key();

  private static Logger LOG = Logger.getLogger(_Person.class);

  public com.as.model.Person localInstanceIn(EOEditingContext editingContext) {
    com.as.model.Person localInstance = (com.as.model.Person)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String firstName() {
    return (String) storedValueForKey(_Person.FIRST_NAME_KEY);
  }

  public void setFirstName(String value) {
    if (_Person.LOG.isDebugEnabled()) {
    	_Person.LOG.debug( "updating firstName from " + firstName() + " to " + value);
    }
    takeStoredValueForKey(value, _Person.FIRST_NAME_KEY);
  }

  public String lastName() {
    return (String) storedValueForKey(_Person.LAST_NAME_KEY);
  }

  public void setLastName(String value) {
    if (_Person.LOG.isDebugEnabled()) {
    	_Person.LOG.debug( "updating lastName from " + lastName() + " to " + value);
    }
    takeStoredValueForKey(value, _Person.LAST_NAME_KEY);
  }

  public String login() {
    return (String) storedValueForKey(_Person.LOGIN_KEY);
  }

  public void setLogin(String value) {
    if (_Person.LOG.isDebugEnabled()) {
    	_Person.LOG.debug( "updating login from " + login() + " to " + value);
    }
    takeStoredValueForKey(value, _Person.LOGIN_KEY);
  }

  public String password() {
    return (String) storedValueForKey(_Person.PASSWORD_KEY);
  }

  public void setPassword(String value) {
    if (_Person.LOG.isDebugEnabled()) {
    	_Person.LOG.debug( "updating password from " + password() + " to " + value);
    }
    takeStoredValueForKey(value, _Person.PASSWORD_KEY);
  }

  public com.as.model.Permissions permissions() {
    return (com.as.model.Permissions)storedValueForKey(_Person.PERMISSIONS_KEY);
  }
  
  public void setPermissions(com.as.model.Permissions value) {
    takeStoredValueForKey(value, _Person.PERMISSIONS_KEY);
  }

  public void setPermissionsRelationship(com.as.model.Permissions value) {
    if (_Person.LOG.isDebugEnabled()) {
      _Person.LOG.debug("updating permissions from " + permissions() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setPermissions(value);
    }
    else if (value == null) {
    	com.as.model.Permissions oldValue = permissions();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _Person.PERMISSIONS_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _Person.PERMISSIONS_KEY);
    }
  }
  
  public NSArray<com.as.model.Subscription> subscriptions() {
    return (NSArray<com.as.model.Subscription>)storedValueForKey(_Person.SUBSCRIPTIONS_KEY);
  }

  public NSArray<com.as.model.Subscription> subscriptions(EOQualifier qualifier) {
    return subscriptions(qualifier, null, false);
  }

  public NSArray<com.as.model.Subscription> subscriptions(EOQualifier qualifier, boolean fetch) {
    return subscriptions(qualifier, null, fetch);
  }

  public NSArray<com.as.model.Subscription> subscriptions(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<com.as.model.Subscription> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(com.as.model.Subscription.PERSON_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = com.as.model.Subscription.fetchSubscriptions(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = subscriptions();
      if (qualifier != null) {
        results = (NSArray<com.as.model.Subscription>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<com.as.model.Subscription>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToSubscriptions(com.as.model.Subscription object) {
    includeObjectIntoPropertyWithKey(object, _Person.SUBSCRIPTIONS_KEY);
  }

  public void removeFromSubscriptions(com.as.model.Subscription object) {
    excludeObjectFromPropertyWithKey(object, _Person.SUBSCRIPTIONS_KEY);
  }

  public void addToSubscriptionsRelationship(com.as.model.Subscription object) {
    if (_Person.LOG.isDebugEnabled()) {
      _Person.LOG.debug("adding " + object + " to subscriptions relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToSubscriptions(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _Person.SUBSCRIPTIONS_KEY);
    }
  }

  public void removeFromSubscriptionsRelationship(com.as.model.Subscription object) {
    if (_Person.LOG.isDebugEnabled()) {
      _Person.LOG.debug("removing " + object + " from subscriptions relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromSubscriptions(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _Person.SUBSCRIPTIONS_KEY);
    }
  }

  public com.as.model.Subscription createSubscriptionsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( com.as.model.Subscription.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _Person.SUBSCRIPTIONS_KEY);
    return (com.as.model.Subscription) eo;
  }

  public void deleteSubscriptionsRelationship(com.as.model.Subscription object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Person.SUBSCRIPTIONS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllSubscriptionsRelationships() {
    Enumeration<com.as.model.Subscription> objects = subscriptions().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteSubscriptionsRelationship(objects.nextElement());
    }
  }


  public static com.as.model.Person createPerson(EOEditingContext editingContext, String firstName
, String lastName
, String login
, String password
, com.as.model.Permissions permissions) {
    com.as.model.Person eo = (com.as.model.Person) EOUtilities.createAndInsertInstance(editingContext, _Person.ENTITY_NAME);    
		eo.setFirstName(firstName);
		eo.setLastName(lastName);
		eo.setLogin(login);
		eo.setPassword(password);
    eo.setPermissionsRelationship(permissions);
    return eo;
  }

  public static ERXFetchSpecification<com.as.model.Person> fetchSpec() {
    return new ERXFetchSpecification<com.as.model.Person>(_Person.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<com.as.model.Person> fetchAllPersons(EOEditingContext editingContext) {
    return _Person.fetchAllPersons(editingContext, null);
  }

  public static NSArray<com.as.model.Person> fetchAllPersons(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Person.fetchPersons(editingContext, null, sortOrderings);
  }

  public static NSArray<com.as.model.Person> fetchPersons(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<com.as.model.Person> fetchSpec = new ERXFetchSpecification<com.as.model.Person>(_Person.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<com.as.model.Person> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static com.as.model.Person fetchPerson(EOEditingContext editingContext, String keyName, Object value) {
    return _Person.fetchPerson(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static com.as.model.Person fetchPerson(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<com.as.model.Person> eoObjects = _Person.fetchPersons(editingContext, qualifier, null);
    com.as.model.Person eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Person that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static com.as.model.Person fetchRequiredPerson(EOEditingContext editingContext, String keyName, Object value) {
    return _Person.fetchRequiredPerson(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static com.as.model.Person fetchRequiredPerson(EOEditingContext editingContext, EOQualifier qualifier) {
    com.as.model.Person eoObject = _Person.fetchPerson(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Person that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static com.as.model.Person localInstanceIn(EOEditingContext editingContext, com.as.model.Person eo) {
    com.as.model.Person localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }

}
