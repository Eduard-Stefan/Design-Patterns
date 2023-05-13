package org.json;

public class C2 {
    private JSONObject json;

    public C2(String jsonString) {
        this.json = new JSONObject(jsonString);
    }

    public int getNum1() {
        return json.getInt("n1");
    }

    public int getNum2() {
        return json.getInt("n2");
    }
}