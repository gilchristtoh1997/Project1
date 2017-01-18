package com.tonikamitv.loginregister;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Gilchrist on 1/14/2017.
 */

public class SearchRequest extends StringRequest {
    private static final String SEARCH_REQUEST_URL = "https://litfinder.000webhostapp.com/users.php";
    private Map<String, String> params;

    public SearchRequest(String name, int age, Response.Listener<String> listener) {
        super(Request.Method.POST, SEARCH_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("name", name);
        params.put("age", age + "");
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
