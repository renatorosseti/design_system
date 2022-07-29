package com.versett.generic_framework.stories

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.generic_framework.ui.theme.Ic20NavArrowLeft
import com.generic_framework.ui.theme.Ic20NavArrowRight
import com.generic_framework.ui.theme.Ic20NavClose
import com.generic_framework.ui.theme.Ic24Account
import com.generic_framework.ui.theme.Ic24AccountNotification
import com.generic_framework.ui.theme.Ic24Alert
import com.generic_framework.ui.theme.Ic24Arrow
import com.generic_framework.ui.theme.Ic24Calendar
import com.generic_framework.ui.theme.Ic24CalendarNotification
import com.generic_framework.ui.theme.Ic24Call
import com.generic_framework.ui.theme.Ic24Check
import com.generic_framework.ui.theme.Ic24CurrentLocation
import com.generic_framework.ui.theme.Ic24ExtendRental
import com.generic_framework.ui.theme.Ic24Extras
import com.generic_framework.ui.theme.Ic24Fpo
import com.generic_framework.ui.theme.Ic24History
import com.generic_framework.ui.theme.Ic24Info
import com.generic_framework.ui.theme.Ic24InputSearch
import com.generic_framework.ui.theme.Ic24LocationAirport
import com.generic_framework.ui.theme.Ic24LocationCity
import com.generic_framework.ui.theme.Ic24LocationNeighborhood
import com.generic_framework.ui.theme.Ic24Lock
import com.generic_framework.ui.theme.Ic24Map
import com.generic_framework.ui.theme.Ic24MessageBubble
import com.generic_framework.ui.theme.Ic24MyRentals
import com.generic_framework.ui.theme.Ic24MyRentalsNotification
import com.generic_framework.ui.theme.Ic24Payment
import com.generic_framework.ui.theme.Ic24Points
import com.generic_framework.ui.theme.Ic24Rating
import com.generic_framework.ui.theme.Ic24RentalDetails
import com.generic_framework.ui.theme.Ic24RentalPreferences
import com.generic_framework.ui.theme.Ic24Resources
import com.generic_framework.ui.theme.Ic24ResourcesNotification
import com.generic_framework.ui.theme.Ic24Scan
import com.generic_framework.ui.theme.Ic24Search
import com.generic_framework.ui.theme.Ic24VehicleFeaturesAc
import com.generic_framework.ui.theme.Ic24VehicleFeaturesCruiseControl
import com.generic_framework.ui.theme.Ic24VehicleFeaturesDoors
import com.generic_framework.ui.theme.Ic24VehicleFeaturesFuel
import com.generic_framework.ui.theme.Ic24VehicleFeaturesLgSuitcase
import com.generic_framework.ui.theme.Ic24VehicleFeaturesMileage
import com.generic_framework.ui.theme.Ic24VehicleFeaturesRange
import com.generic_framework.ui.theme.Ic24VehicleFeaturesSmSuitcase
import com.generic_framework.ui.theme.Ic24VehicleFeaturesTransmission
import com.generic_framework.ui.theme.Ic24VehicleTypeEv
import com.generic_framework.ui.theme.Ic24VehicleTypePremium
import com.generic_framework.ui.theme.Ic24VehicleTypeSedan
import com.generic_framework.ui.theme.Ic24VehicleTypeSuv
import com.generic_framework.ui.theme.Ic24VehicleTypeTruck
import com.generic_framework.ui.theme.Ic24VehicleTypeVan
import com.generic_framework.ui.theme.Ic24X
import com.generic_framework.ui.theme.Icons
import com.generic_framework.ui.theme.ic24VehicleFeaturesSeats
import com.versett.generic_framework_ui_android.R

@Composable
fun IconStory() {

    LazyColumn(
        contentPadding = PaddingValues(horizontal = dimensionResource(R.dimen.space_16dp), vertical = dimensionResource(R.dimen.space_8dp)),
    ) {
        item {
            Row {
                Icons.Ic24Account(
                    contentDescription = "Account",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Account", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24AccountNotification(
                    contentDescription = "Account Notification",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "AccountNotification", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24Alert(
                    contentDescription = "Alert",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Alert", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24Arrow(
                    contentDescription = "Arrow",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Arrow", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24Calendar(
                    contentDescription = "Calendar",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Calendar", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24CalendarNotification(
                    contentDescription = "Calendar Notification",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "CalendarNotification", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24Call(
                    contentDescription = "Call",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Call", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24Check(
                    contentDescription = "Check",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Check", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24X(
                    contentDescription = "Close",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Close", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24CurrentLocation(
                    contentDescription = "Current Location",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "CurrentLocation", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24ExtendRental(
                    contentDescription = "Extend Rental",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "ExtendRental", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24Extras(
                    contentDescription = "Extras",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Extras", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24Fpo(
                    contentDescription = "Fpo",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Fpo", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24History(
                    contentDescription = "History",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "History", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24Info(
                    contentDescription = "Info",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Info", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24InputSearch(
                    contentDescription = "Input Search",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "InputSearch", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24LocationAirport(
                    contentDescription = "Location Airport",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Location Airport", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24LocationCity(
                    contentDescription = "Location City",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Location City", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24LocationNeighborhood(
                    contentDescription = "Location Neighborhood",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Location Neighborhood", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24Lock(
                    contentDescription = "Lock",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Lock", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24Map(
                    contentDescription = "Map",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Map", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24MessageBubble(
                    contentDescription = "Message Bubble",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Message Bubble", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24MyRentals(
                    contentDescription = "My Rentals",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "My Rentals", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24MyRentalsNotification(
                    contentDescription = "My Rentals Notification",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "My Rentals Notification", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic20NavArrowLeft(
                    contentDescription = "Nav Arrow Left",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Nav Arrow Left", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic20NavArrowRight(
                    contentDescription = "Nav Arrow Right",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Nav Arrow Right", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic20NavClose(
                    contentDescription = "Nav Close",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Nav Close", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24Payment(
                    contentDescription = "Payment",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Payment", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24Points(
                    contentDescription = "Points",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Points", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24Rating(
                    contentDescription = "Rating",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Rating", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24RentalDetails(
                    contentDescription = "Rental Details",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Rental Details", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24RentalPreferences(
                    contentDescription = "Rental Preferences",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Rental Preferences", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24Resources(
                    contentDescription = "Resources",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Resources", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24ResourcesNotification(
                    contentDescription = "Resources Notification",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Resources Notification", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24Scan(
                    contentDescription = "Scan",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Scan", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24Search(
                    contentDescription = "Search",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Search", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24Scan(
                    contentDescription = "Scan",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Scan", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24VehicleFeaturesAc(
                    contentDescription = "Ac",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Ac", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24VehicleFeaturesCruiseControl(
                    contentDescription = "Cruise Control",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Cruise Control", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24VehicleFeaturesDoors(
                    contentDescription = "Doors",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Doors", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24VehicleFeaturesFuel(
                    contentDescription = "Fuel",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Fuel", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24VehicleFeaturesLgSuitcase(
                    contentDescription = "Large Suitcase",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Large Suitcase", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24VehicleFeaturesMileage(
                    contentDescription = "Mileage",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Mileage", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24VehicleFeaturesRange(
                    contentDescription = "Range",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Range", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.ic24VehicleFeaturesSeats(
                    contentDescription = "Seats",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Seats", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24VehicleFeaturesSmSuitcase(
                    contentDescription = "Small Suitcase",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Small Suitcase", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24VehicleFeaturesTransmission(
                    contentDescription = "Transmission",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Transmission", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24VehicleTypeEv(
                    contentDescription = "EV",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "EV", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24VehicleTypePremium(
                    contentDescription = "Premium",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Premium", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24VehicleTypeSedan(
                    contentDescription = "Sedan",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Sedan", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24VehicleTypeSuv(
                    contentDescription = "SUV",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "SUV", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24VehicleTypeTruck(
                    contentDescription = "Truck",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Truck", modifier = Modifier.wrapContentWidth())
            }
            Row {
                Icons.Ic24VehicleTypeVan(
                    contentDescription = "Van",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(end = dimensionResource(R.dimen.space_10dp))
                )
                Text(text = "Van", modifier = Modifier.wrapContentWidth())
            }
        }
    }
}
