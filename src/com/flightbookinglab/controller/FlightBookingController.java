package com.flightbookinglab.controller;

import com.flightbookinglab.model.Route;
import com.flightbookinglab.exception.AirportNotFoundException;
import com.flightbookinglab.exception.RouteNotFoundException;
import com.flightbookinglab.model.Airports;
import com.flightbookinglab.routeplanner.RoutePlanner;
import com.flightbookinglab.routeplanner.RoutePlannerFactory;
import com.flightbookinglab.routeplanner.RoutePlannerType;

/**
 * Created by annarvekar on 7/8/14.
 */
public class FlightBookingController {

    public Route getShortestRoute(String source, String destination) throws RouteNotFoundException, AirportNotFoundException {
        RoutePlanner routePlanner = RoutePlannerFactory.getRoutePlanner(RoutePlannerType.SHORTEST);
        return routePlanner.plan(Airports.getAirport(source), Airports.getAirport(destination));
    }
}
