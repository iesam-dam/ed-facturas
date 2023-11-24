import java.util.ArrayList;

public class Factura {
    private String codigo;
    private String date;
    private String baseImponible;
    private String total;
    private Cliente cliente;

    private ArrayList<Item> itemList = new ArrayList<>();

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBaseImponible() {
        return baseImponible;
    }

    public void setBaseImponible(String baseImponible) {
        this.baseImponible = baseImponible;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public Item getItem(Integer posicion) {
        return itemList.get(posicion);
    }

}
