import java.util.GregorianCalendar;

import javax.swing.DefaultListModel;



public class prova {

	public static DefaultListModel listModel;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listModel = new DefaultListModel();
		for (int i = 0; i < 2; i++)
			listModel.addElement(null);
		
		System.out.println(listModel.toString());
		
		GregorianCalendar data = null;
		data.setTime(null);
	}
	

}
