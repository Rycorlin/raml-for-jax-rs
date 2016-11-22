package server.cars;

import example.helloworld.Search;
import example.realtypes.Car;
import example.realtypes.CarImpl;
import example.realtypes.Inventory;

/**
 * Created by Jean-Philippe Belanger on 11/11/16.
 * Just potential zeroes and ones
 */
public class InventoryImpl implements Inventory {

    @Override
    public GetResponse get() {

        CarImpl ci = new CarImpl();
        ci.setMake("Foo");
        ci.setNumber(10000);
        return GetResponse.respond200(ci);
    }

    @Override
    public PutResponse put(Car entity) {
        System.err.println("entity " + entity.getMake());
        return null;
    }
}