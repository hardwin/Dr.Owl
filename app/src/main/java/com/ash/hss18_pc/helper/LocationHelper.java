package com.ash.hss18_pc.helper;

import android.content.Context;
import android.widget.TextView;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.apache.http.Header;

/**
 * Created by HSS18-PC on 6/13/2015.
 */
public class LocationHelper {

    String PinCode;
    TextView v;

    public LocationHelper(TextView v, String PinCode) {
        this.v = v;
        this.PinCode = PinCode;
    }

    public void getLocationFromPinCodeIndia(Context con) {
        AsyncHttpClient client = new AsyncHttpClient();
        client.get("http://getpincodes.info/api.php?pincode=" + PinCode, new AsyncHttpResponseHandler() {


            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] response) {
                // called when response HTTP status is "200 OK"

                v.setText("" + new String(response));
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] errorResponse, Throwable e) {
                // called when response HTTP status is "4XX" (eg. 401, 403, 404)

            }


        });
    }

    public void getLocationFromPinCodeUS(Context con) {
        AsyncHttpClient client = new AsyncHttpClient();
        client.get("http://ziptasticapi.com/" + PinCode, new AsyncHttpResponseHandler() {


            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] response) {
                // called when response HTTP status is "200 OK"

                v.setText("" + new String(response));
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] errorResponse, Throwable e) {
                // called when response HTTP status is "4XX" (eg. 401, 403, 404)

            }


        });
    }
}

