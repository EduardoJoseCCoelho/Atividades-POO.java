public class Go {
	
	public static void main(String[] args) {

		Prancha prancha1 = new Prancha ("T.PATTERSON");
	
		System.out.println(prancha1.toString());
		System.out.println("Modelo Shape: "  + prancha1.getModeloShape());
		System.out.println("Tamanho Shape: " + prancha1.getTamanho());
		System.out.println("Volume Shape: "  + prancha1.getLitragem());
		System.out.println("Marca Quilha: "  + prancha1.getMarcaQuilha());
		System.out.println("Tipo Quilha:"    + prancha1.getTipoQuilha());
		System.out.println("Marca Leash: "   + prancha1.getMarcaLeash());
		System.out.println("Tamanho Leash: " + prancha1.getTamanhoLeash());
	
}
}