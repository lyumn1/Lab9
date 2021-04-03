
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
   	// TODO Auto-generated method stub
		ArrayList<Person> people = new ArrayList<Person>();
		people.add(new Person("Mofay",100,"white"));
		people.add(new Person("Lucy",12,"blue"));
		people.add(new Person("Mike",18,"green"));
		people.add(new Person("Cici",19,"yellow"));
		people.add(new Person("Jone",22,"orange"));
		try {
			FileWriter fw = new FileWriter("f:\\data.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			for(Person p : people) {
				System.out.println(p.getName()+" "+String.valueOf(p.getAge())+" "+p.getColor());
				bw.write(p.getName()+" "+String.valueOf(p.getAge())+" "+p.getColor());
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		try {
			FileReader fr = new FileReader("f:\\data.txt");
			BufferedReader br = new BufferedReader(fr);
			String str = null;
			while((str = br.readLine())!=null) {
				System.out.println(str);
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
}