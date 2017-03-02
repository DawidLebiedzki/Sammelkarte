package model;

import java.util.Date;

import javax.persistence.*;

@Entity(name = "scrap")
public class Scrap {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@OneToOne
	@JoinColumn(name = "users_username")
	private User user;

	private double quantity;
	private String numberOfOrder;

	@OneToOne
	@JoinColumn(name = "variants_id")
	private Variant variant;

	private String druckstelle;
	private String grat;
	private String aufkocher;
	private String etikettFehlerhaft;
	private String bauteilZuKurz;
	private String radienFehlen;
	private String rostAmBauteil;
	private String gewindeNichtForchanden;
	private String sonstigeFehler;
	private String beschaedigungBeschnitt;
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;

	public Scrap(){};

	public Scrap(User user, double quantity, String numberOfOrder, Variant variant, String druckstelle, String grat,
				 String aufkocher, String etikettFehlerhaft, String bauteilZuKurz, String radienFehlen, String rostAmBauteil,
				 String gewindeNichtForchanden, String sonstigeFehler, String beschaedigungBeschnitt, Date date) {
		this.user = user;
		this.quantity = quantity;
		this.numberOfOrder = numberOfOrder;
		this.variant = variant;
		this.druckstelle = druckstelle;
		this.grat = grat;
		this.aufkocher = aufkocher;
		this.etikettFehlerhaft = etikettFehlerhaft;
		this.bauteilZuKurz = bauteilZuKurz;
		this.radienFehlen = radienFehlen;
		this.rostAmBauteil = rostAmBauteil;
		this.gewindeNichtForchanden = gewindeNichtForchanden;
		this.sonstigeFehler = sonstigeFehler;
		this.beschaedigungBeschnitt = beschaedigungBeschnitt;
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public String getNumberOfOrder() {
		return numberOfOrder;
	}

	public void setNumberOfOrder(String numberOfOrder) {
		this.numberOfOrder = numberOfOrder;
	}

	public Variant getVariant() {
		return variant;
	}

	public void setVariant(Variant variant) {
		this.variant = variant;
	}

	public String getDruckstelle() {
		return druckstelle;
	}

	public void setDruckstelle(String druckstelle) {
		this.druckstelle = druckstelle;
	}

	public String getGrat() {
		return grat;
	}

	public void setGrat(String grat) {
		this.grat = grat;
	}

	public String getAufkocher() {
		return aufkocher;
	}

	public void setAufkocher(String aufkocher) {
		this.aufkocher = aufkocher;
	}

	public String getEtikettFehlerhaft() {
		return etikettFehlerhaft;
	}

	public void setEtikettFehlerhaft(String etikettFehlerhaft) {
		this.etikettFehlerhaft = etikettFehlerhaft;
	}

	public String getBauteilZuKurz() {
		return bauteilZuKurz;
	}

	public void setBauteilZuKurz(String bauteilZuKurz) {
		this.bauteilZuKurz = bauteilZuKurz;
	}

	public String getRadienFehlen() {
		return radienFehlen;
	}

	public void setRadienFehlen(String radienFehlen) {
		this.radienFehlen = radienFehlen;
	}

	public String getRostAmBauteil() {
		return rostAmBauteil;
	}

	public void setRostAmBauteil(String rostAmBauteil) {
		this.rostAmBauteil = rostAmBauteil;
	}

	public String getGewindeNichtForchanden() {
		return gewindeNichtForchanden;
	}

	public void setGewindeNichtForchanden(String gewindeNichtForchanden) {
		this.gewindeNichtForchanden = gewindeNichtForchanden;
	}

	public String getSonstigeFehler() {
		return sonstigeFehler;
	}

	public void setSonstigeFehler(String sonstigeFehler) {
		this.sonstigeFehler = sonstigeFehler;
	}

	public String getBeschaedigungBeschnitt() {
		return beschaedigungBeschnitt;
	}

	public void setBeschaedigungBeschnitt(String beschaedigungBeschnitt) {
		this.beschaedigungBeschnitt = beschaedigungBeschnitt;
	}


}
