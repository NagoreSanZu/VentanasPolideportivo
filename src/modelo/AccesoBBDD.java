package modelo;


import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Conector;
import modelo.Actividad;
import modelo.Inscripcion;
import modelo.Usuario;
/**
 * 
 * @author irakasle
 *	todos los métodos que accedan a la BBDD estarán aqui
 *	en esta clase no tiene que haber ningun Scanner ni System.ou.println
 */
public class AccesoBBDD extends Conector{

	public void insertarUsuario(Usuario user) throws SQLException {
		
		PreparedStatement pstInsert = super.conexion.prepareStatement("INSERT INTO usuarios ( nombre_apellido, dni, codigo ) VALUES(?,?,?)");
		pstInsert.setString(1, user.getNombreApellido());
		pstInsert.setString(2, user.getDni());
		pstInsert.setString(3, user.getCodigo());
		pstInsert.execute();
		
	}
	public  ArrayList <Usuario> getUsuarios() throws SQLException {
	
			String senteciaSelect = "SELECT * FROM usuarios";
			Statement st = super.conexion.createStatement();
			ArrayList<Usuario> usuarios= new ArrayList <Usuario>();
			
			
			ResultSet resultado =st.executeQuery(senteciaSelect);
			while(resultado.next()) {
				
				Usuario usuario=new Usuario();
				
				
				usuario.setId(resultado.getInt("id"));
				usuario.setNombreApellido(resultado.getString("nombre_apellido"));
				usuario.setDni(resultado.getString("dni"));
				usuario.setCodigo(resultado.getString("codigo"));
				usuarios.add(usuario);
			}
			return usuarios;
		}
	
	public Actividad buscarActividadNombre(String nombre) {
		String senteciaSelect = "SELECT * FROM actividades WHERE nombre=?";
		try {
			PreparedStatement st = super.conexion.prepareStatement(senteciaSelect);
			st.setString(1,nombre);
			Actividad actividad = new Actividad();
			ResultSet resultado =st.executeQuery();
			resultado.next();
			
			actividad.setId(resultado.getInt("id"));
			actividad.setNombre(resultado.getString("nombre"));
			actividad.setFecha_inicio(resultado.getDate("fecha_inicio"));
			actividad.setDias_semana(resultado.getString("dias_semana"));
			actividad.setHoras(resultado.getInt("horas"));
			actividad.setMax_participantes(resultado.getInt("max_participantes"));
			actividad.setPrecio(resultado.getDouble("precio"));
			

			return actividad;


			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	public Usuario buscarUsuairioCodigo(String codigo) {
		String senteciaSelect = "SELECT * FROM usuarios WHERE codigo=?";
		
		try {
			PreparedStatement st = super.conexion.prepareStatement(senteciaSelect);
			st.setString(1, codigo);
			
			Usuario usuario = new Usuario();
			ResultSet resultado =st.executeQuery();
			resultado.next();
			
			usuario.setId(resultado.getInt("id"));
			usuario.setNombreApellido(resultado.getString("nombre_apellido"));
			usuario.setDni(resultado.getString("dni"));
			usuario.setCodigo(resultado.getString("codigo"));
			
			return usuario; 

			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	
	
	public  ArrayList <Inscripcion> getInscripciones() throws SQLException {
		
		String senteciaSelect = "SELECT * FROM inscripciones";
		Statement st = super.conexion.createStatement();
		ArrayList<Inscripcion > inscripciones = new ArrayList <Inscripcion>();
		
		
		ResultSet resultado =st.executeQuery(senteciaSelect);
		while(resultado.next()) {
			
			Inscripcion inscripcion=new Inscripcion();
			
			inscripcion.setId(resultado.getInt("id"));
			inscripcion.setId_usuario(resultado.getInt("id_usuario"));
			inscripcion.setId_actividad(resultado.getInt("id_actividad"));
			
			inscripciones.add(inscripcion);
		}
		return inscripciones;
	}
	
	
	
	public void modificarActividad(String actividadSemana, int id ) throws SQLException {
		PreparedStatement pstInsert = super.conexion.prepareStatement("UPDATE actividades SET dias_semana=? WHERE id=?");
		
		pstInsert.setString(1, actividadSemana);
		pstInsert.setInt(2,id);
		
		pstInsert.execute();
		
	
	}

	
	public void borrarInscripcion(int idActividad, int idUsuario ) throws SQLException {
		
		PreparedStatement pstDelete = super.conexion.prepareStatement("DELETE FROM inscripciones WHERE id_usuario =? AND id_actividad =?");
		pstDelete.setInt(1, idUsuario);
		pstDelete.setInt(2, idActividad);

		System.out.println("Eliminando actividad...");
		pstDelete.execute();
	}
	
	public  ArrayList <Actividad> getactividades() throws SQLException {
		
		String senteciaSelect = "SELECT * FROM actividades";
		Statement st = super.conexion.createStatement();
		ArrayList<Actividad > actividades = new ArrayList <Actividad>();
		
		
		ResultSet resultado =st.executeQuery(senteciaSelect);
		while(resultado.next()) {
			
			Actividad actividad =new Actividad();
			
			actividad.setId(resultado.getInt("id"));
			actividad.setNombre(resultado.getString("nombre"));
			actividad.setFecha_inicio(new Date(actividad.getFecha_inicio().getTime()));
			actividad.setDias_semana(resultado.getString("dias_semana"));
			actividad.setHoras(resultado.getInt("horas"));
			actividad.setMax_participantes(resultado.getInt("max_participantes"));
			actividad.setPrecio(resultado.getDouble("precio"));
			
			actividades.add(actividad);
		}
		return actividades;
	}
	
	}//fin

	
	
	
	
	
	



