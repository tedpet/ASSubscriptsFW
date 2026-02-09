package com.as.migrations;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;

import er.extensions.jdbc.ERXJDBCUtilities;
import er.extensions.migration.ERXMigrationDatabase;
import er.extensions.migration.ERXMigrationTable;
import er.extensions.migration.ERXModelVersion;

public class ASMasterEOModel0 extends ERXMigrationDatabase.Migration {
	@Override
	public NSArray<ERXModelVersion> modelDependencies() {
		return null;
	}
  
	@Override
	public void downgrade(EOEditingContext editingContext, ERXMigrationDatabase database) throws Throwable {
		// DO NOTHING
	}

	@Override
	public void upgrade(EOEditingContext editingContext, ERXMigrationDatabase database) throws Throwable {
		
		ERXMigrationTable permissionsTable = database.newTableNamed("permissions");
		permissionsTable.newFlagBooleanColumn("addssubscriptions", NOT_NULL);
		permissionsTable.newFlagBooleanColumn("editspeople", NOT_NULL);
		permissionsTable.newIntegerColumn("id", NOT_NULL);
		permissionsTable.create();
	 	permissionsTable.setPrimaryKey("id");

		ERXMigrationTable personTable = database.newTableNamed("person");
		personTable.newLargeStringColumn("firstname", NOT_NULL);
		personTable.newIntegerColumn("id", NOT_NULL);
		personTable.newLargeStringColumn("lastname", NOT_NULL);
		personTable.newLargeStringColumn("login", NOT_NULL);
		personTable.newLargeStringColumn("password", NOT_NULL);
		personTable.newIntegerColumn("permissionsid", NOT_NULL);
		personTable.create();
	 	personTable.setPrimaryKey("id");

		ERXMigrationTable subscriptionTable = database.newTableNamed("subscription");
		subscriptionTable.newDateColumn("datesubscribed", NOT_NULL);
		subscriptionTable.newLargeStringColumn("emailaccount", NOT_NULL);
		subscriptionTable.newIntegerColumn("id", NOT_NULL);
		subscriptionTable.newIntegerColumn("personid", NOT_NULL);
		subscriptionTable.newLargeStringColumn("subid", NOT_NULL);
		subscriptionTable.newLargeStringColumn("subpassword", NOT_NULL);
		subscriptionTable.newLargeStringColumn("subscrptionname", NOT_NULL);
		subscriptionTable.create();
	 	subscriptionTable.setPrimaryKey("id");

		personTable.addForeignKey("permissionsid", "permissions", "id");
		subscriptionTable.addForeignKey("personid", "person", "id");
		
		ERXJDBCUtilities.executeUpdateScriptFromResourceNamed(database.adaptorChannel(),
				"Startup-" + ERXJDBCUtilities.databaseProductName(database.adaptorChannel()) + ".sql", "ASSubscripts");
	}
	
}