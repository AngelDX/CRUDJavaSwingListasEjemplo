package AngelDX.modelo;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Crud {
    ArrayList<Estudiante> listae=new ArrayList<>();
    
    public void create(Estudiante e){
        listae.add(e);
    }
    
    public void delete(int id){
        System.out.println("Eliminado el estudiante"+id);
        listae.remove(id);
    }
    
    public void imprimirLista(JTable table){
        DefaultTableModel dtm=new DefaultTableModel();
        dtm.addColumn("ID");
        dtm.addColumn("NOMBRE");
        dtm.addColumn("CICLO");
        dtm.addColumn("NOTA");
        for (int i = 0; i < listae.size(); i++) {
            System.out.println(listae.get(i));
            Object[] fila=new Object[5];
            fila[0]=listae.get(i).getId();
            fila[1]=listae.get(i).getNombre();
            fila[2]=listae.get(i).getCiclo();
            fila[3]=listae.get(i).getNota();
            dtm.addRow(fila);
        }
        table.setModel(dtm);
    }
}
