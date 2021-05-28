public class Prancha implements Shape, Quilha, Leash {
	
	private String marca;
	
	
	
	public Prancha(String marca) {
		this.setMarca(marca);
	}
	
	
	
	@Override
	public String getTamanhoLeash() {
		return "5.5mm";
	}

	@Override
	public String getMarcaLeash() {
		return "FCS";
	}

	@Override
	public String getTipoQuilha() {
		return "Tri-Quilha";
	}

	@Override
	public String getMarcaQuilha() {
		return "M&M";
	}

	@Override
	public String getModeloShape() {
		return "IF 15";
	}

	@Override
	public String getTamanho() {
		return "5.9'";
	}

    @Override
	public String getLitragem() {
		return "26.0 litros";
	}


	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}



    @Override
    public String toString() {
        return "Prancha [Fabricante = " + marca + "]";
    }

    


}