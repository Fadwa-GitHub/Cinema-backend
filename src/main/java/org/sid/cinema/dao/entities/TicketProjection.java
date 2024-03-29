package org.sid.cinema.dao.entities;



import org.springframework.data.rest.core.config.Projection;

@Projection(name="ticketProj",types=Ticket.class)
public interface TicketProjection {
	public Long getId();
	public String GetNomClient();
	public double getPrix();
	public Integer codePayement();
	public boolean getReserve();
	public Place getPlace();
	
	
}
