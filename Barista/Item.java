// ============================================================
// Item.java  —  one thing on the cafe menu (e.g. "mocha", 3.5)
// Fill every ___ . It won't compile until all blanks are filled.
// ============================================================

// GOOD: whole file is correct — private fields, this.x = x, getters return, setters are void. ✅
public class Item {

    // ---------- 1. MEMBER VARIABLES ----------
    // HINT: both must be PRIVATE now (that's the whole point of getters/setters)
    private String name;      // TODO: access modifier + type (text)
    private double price;     // TODO: access modifier + type (decimal number)


    // ---------- 2. CONSTRUCTOR ----------
    // HINT: takes a name and a price, saves them into the fields above.
    // HINT: when the parameter has the same name as the field, use "this." for the field.
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }


    // ---------- 3. GETTERS ----------
    // HINT: a getter RETURNS the field. Return type = the field's type. No parameters.
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    // ---------- 4. SETTERS ----------
    // HINT: a setter RECEIVES a value and STORES it. Return type is always "void".
    public void setName(String name) {
        this.name = name;
    }

    // TODO: write setPrice yourself (same shape as setName)
    public void setPrice(double price){
        this.price = price;
    }
}
