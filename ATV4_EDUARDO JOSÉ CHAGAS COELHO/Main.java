import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

        Gerente gerente = new Gerente(26,"Pedro Barros","852147369101","Gerente",10580.00, 0.25,"Brasil",2); 
        Vendedor vendedor = new Vendedor(19,"Luiz Francisco","71498365280","Vendedor Interno", 5300.30, gerente,5,0.06,0);
        Vendedor vendedor2 = new Vendedor(17,"Pedro Quintas","65491378205","Vendedor Balcão", 6150.05, gerente,3,0.04,1);

        List<Vendas> vendas = new ArrayList<>();
        List<Vendas> vendas02 = new ArrayList<>();
        List<Vendedor> vendedores = new ArrayList<>();

        
        vendedores.add(vendedor);
        vendedores.add(vendedor2);

        
        gerente.setVendedores(vendedores);

        
        Vendas vendas1 = new Vendas(250);
        Vendas vendas2 = new Vendas(820);
        Vendas vendas3 = new Vendas(465);
        Vendas vendas4 = new Vendas(357);
        Vendas vendas5 = new Vendas(154);
        Vendas vendas6 = new Vendas(934);
        Vendas vendas7 = new Vendas(2504);
        Vendas vendas8 = new Vendas(514);
        Vendas vendas9 = new Vendas(7621);
        Vendas vendas10 = new Vendas(3287);

       
        vendas.add(vendas1);
        vendas.add(vendas2);
        vendas.add(vendas3);
        vendas.add(vendas4);
        vendas.add(vendas5);
        
        vendas02.add(vendas6);
        vendas02.add(vendas7);
        vendas02.add(vendas8);
        vendas02.add(vendas9);
        vendas02.add(vendas10);

        vendedor.setVendas(vendas);

        vendedor2.setVendas(vendas02);

        vendedor.getTotalVendas();
        vendedor.getTotalComissao();

        vendedor2.getTotalVendas();
        vendedor2.getTotalComissao();

        gerente.getComissaoTotalGerente();

        System.out.println();
        System.out.println(vendedor.getNome()+" "+vendedor.getVendas()+ " " + vendedor.getSalario());
        System.out.println();
        System.out.println(vendedor2.getNome()+" "+vendedor2.getVendas()+ " " + vendedor2.getSalario());
        System.out.println();
        System.out.println(gerente.getNome()+" "+gerente.getSalario());

    }

}
