// DO NOT EDIT.  Make changes to com.as.model.Permissions.java instead.
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
public abstract class _Permissions extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "Permissions";

  // Attribute Keys
  public static final ERXKey<Boolean> ADDS_SUBSCRIPTIONS = new ERXKey<Boolean>("addsSubscriptions");
  public static final ERXKey<Boolean> EDITS_PEOPLE = new ERXKey<Boolean>("editsPeople");
  // Relationship Keys
  public static final ERXKey<com.as.model.Person> PERSONS = new ERXKey<com.as.model.Person>("persons");

  // Attributes
  public static final String ADDS_SUBSCRIPTIONS_KEY = ADDS_SUBSCRIPTIONS.key();
  public static final String EDITS_PEOPLE_KEY = EDITS_PEOPLE.key();
  // Relationships
  public static final String PERSONS_KEY = PERSONS.key();

  private static Logger LOG = Logger.getLogger(_Permissions.class);

  public com.as.model.Permissions localInstanceIn(EOEditingContext editingContext) {
    com.as.model.Permissions localInstance = (com.as.model.Permissions)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Boolean addsSubscriptions() {
    return (Boolean) storedValueForKey(_Permissions.ADDS_SUBSCRIPTIONS_KEY);
  }

  public void setAddsSubscriptions(Boolean value) {
    if (_Permissions.LOG.isDebugEnabled()) {
    	_Permissions.LOG.debug( "updating addsSubscriptions from " + addsSubscriptions() + " to " + value);
    }
    takeStoredValueForKey(value, _Permissions.ADDS_SUBSCRIPTIONS_KEY);
  }

  public Boolean editsPeople() {
    return (Boolean) storedValueForKey(_Permissions.EDITS_PEOPLE_KEY);
  }

  public void setEditsPeople(Boolean value) {
    if (_Permissions.LOG.isDebugEnabled()) {
    	_Permissions.LOG.debug( "updating editsPeople from " + editsPeople() + " to " + value);
    }
    takeStoredValueForKey(value, _Permissions.EDITS_PEOPLE_KEY);
  }

  public NSArray<com.as.model.Person> persons() {
    return (NSArray<com.as.model.Person>)storedValueForKey(_Permissions.PERSONS_KEY);
  }

  public NSArray<com.as.model.Person> persons(EOQualifier qualifier) {
    return persons(qualifier, null, false);
  }

  public NSArray<com.as.model.Person> persons(EOQualifier qualifier, boolean fetch) {
    return persons(qualifier, null, fetch);
  }

  public NSArray<com.as.model.Person> persons(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<com.as.model.Person> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(com.as.model.Person.PERMISSIONS_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = com.as.model.Person.fetchPersons(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = persons();
      if (qualifier != null) {
        results = (NSArray<com.as.model.Person>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<com.as.model.Person>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToPersons(com.as.model.Person object) {
    includeObjectIntoPropertyWithKey(object, _Permissions.PERSONS_KEY);
  }

  public void removeFromPersons(com.as.model.Person object) {
    excludeObjectFromPropertyWithKey(object, _Permissions.PERSONS_KEY);
  }

  public void addToPersonsRelationship(com.as.model.Person object) {
    if (_Permissions.LOG.isDebugEnabled()) {
      _Permissions.LOG.debug("adding " + object + " to persons relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToPersons(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _Permissions.PERSONS_KEY);
    }
  }

  public void removeFromPersonsRelationship(com.as.model.Person object) {
    if (_Permissions.LOG.isDebugEnabled()) {
      _Permissions.LOG.debug("removing " + object + " from persons relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromPersons(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _Permissions.PERSONS_KEY);
    }
  }

  public com.as.model.Person createPersonsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( com.as.model.Person.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _Permissions.PERSONS_KEY);
    return (com.as.model.Person) eo;
  }

  public void deletePersonsRelationship(com.as.model.Person object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Permissions.PERSONS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllPersonsRelationships() {
    Enumeration<com.as.model.Person> objects = persons().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deletePersonsRelationship(objects.nextElement());
    }
  }


  public static com.as.model.Permissions createPermissions(EOEditingContext editingContext, Boolean addsSubscriptions
, Boolean editsPeople
) {
    com.as.model.Permissions eo = (com.as.model.Permissions) EOUtilities.createAndInsertInstance(editingContext, _Permissions.ENTITY_NAME);    
		eo.setAddsSubscriptions(addsSubscriptions);
		eo.setEditsPeople(editsPeople);
    return eo;
  }

  public static ERXFetchSpecification<com.as.model.Permissions> fetchSpec() {
    return new ERXFetchSpecification<com.as.model.Permissions>(_Permissions.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<com.as.model.Permissions> fetchAllPermissionses(EOEditingContext editingContext) {
    return _Permissions.fetchAllPermissionses(editingContext, null);
  }

  public static NSArray<com.as.model.Permissions> fetchAllPermissionses(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Permissions.fetchPermissionses(editingContext, null, sortOrderings);
  }

  public static NSArray<com.as.model.Permissions> fetchPermissionses(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<com.as.model.Permissions> fetchSpec = new ERXFetchSpecification<com.as.model.Permissions>(_Permissions.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<com.as.model.Permissions> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static com.as.model.Permissions fetchPermissions(EOEditingContext editingContext, String keyName, Object value) {
    return _Permissions.fetchPermissions(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static com.as.model.Permissions fetchPermissions(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<com.as.model.Permissions> eoObjects = _Permissions.fetchPermissionses(editingContext, qualifier, null);
    com.as.model.Permissions eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Permissions that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static com.as.model.Permissions fetchRequiredPermissions(EOEditingContext editingContext, String keyName, Object value) {
    return _Permissions.fetchRequiredPermissions(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static com.as.model.Permissions fetchRequiredPermissions(EOEditingContext editingContext, EOQualifier qualifier) {
    com.as.model.Permissions eoObject = _Permissions.fetchPermissions(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Permissions that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static com.as.model.Permissions localInstanceIn(EOEditingContext editingContext, com.as.model.Permissions eo) {
    com.as.model.Permissions localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }

}
