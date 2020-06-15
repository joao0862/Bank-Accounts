package Data;

public class Data{
	private int Dia, Mes, Ano;
	
	public Data() {
		this.Dia = 0;
		this.Mes= 0;
		this.Ano =0;
	}
	
	public Data(int dia, int mes, int ano) {
		if(mes==2) {
			if(((ano%4==0) && (ano%100 != 0)) || (ano%400) == 0) {
				if(dia>29) {
					System.out.println("Data inválida.");
				}else {
					this.Dia = dia;
				}
			}else {
				if(dia>28) {
					System.out.println("Data inválida.");
				}else {
					this.Dia = dia;
				}
			}
			this.Mes = mes;
			this.Ano = ano;
		}else {
			this.Dia=dia;
			this.Mes=mes;
			this.Ano=ano;
		}
	}
		
	
	public String DataFormatada() {
		String dat = this.Dia + "/";
		dat += this.Mes + "/";
		dat += this.Ano;
		return dat;
	}
	
	public void setDia(int dia) {
		this.Dia = dia;
	}
	public int getDia() {
		return this.Dia;
	}
	public void setMes(int mes) {
		this.Mes = mes;
	}
	public int getMes() {
		return this.Mes;
	}
	public void setAno(int ano) {
		this.Ano = ano;
	}
	public int getAno() {
		return this.Ano;
	}
}