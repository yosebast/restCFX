package org.okis.properties;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;
import java.util.Set;




public class PropertiesHandler extends Properties {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String fileName = null;
	
	private Properties props;

	
	public PropertiesHandler(){
		props = new Properties();
	}
	
	
	@Override
	public synchronized Object setProperty(String key, String value)
	{
		return null;
	}
	
	@Override
	public synchronized void load(Reader reader) throws IOException
	{
		
	}
	
	@Override
	public synchronized void load(InputStream inStream) throws IOException 
	{
		
	}
	
	@Override
	public void store(Writer writer, String comments) throws IOException
	{
		
	}
	
	@Override
	public void store(OutputStream out, String comments) throws IOException
	{
		
		
	}
	
	@Override
	public synchronized void loadFromXML(InputStream in) throws InvalidPropertiesFormatException, IOException
	{
		
	}
	
	@Override
	public void storeToXML(OutputStream os, String comment) throws IOException
	{
		
	}
	
	@Override
	public void storeToXML(OutputStream os, String comment, String encoding) throws IOException
	{
		
	}
	
	
	public Properties getProperties()
	{
		return this.props;
	}
	
	@Override
	public String getProperty(String key)
	{
		String propert = this.props.getProperty(key);
		if(propert == null){
			System.out.println("la property "+ key +" no existe o no se encuentra.");
		}
		return propert;
	}
	
	@Override
	public String getProperty(String key, String defaultValue)
	{
		String toReturn = this.props.getProperty(key);
		if(toReturn==null)
		{
			toReturn = defaultValue;
		}
		
		return toReturn;
	}
	
	
	@Override
	public Enumeration<?> propertyNames() 
	{
		return null;
	}
	
	@Override
	public Set<String> stringPropertyNames()
	{
		return null;
	}
	
	@Override
	public void list(PrintStream out) 
	{
		
	}
	
	@Override
	public void list(PrintWriter out) 
	{
		
	}
	
	public String getFileName() {
		return fileName;
	}


	public void setFileName(String fileName) {
		this.fileName = fileName;
		try {
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setFileName(String path, String fileName, String extension, PropertiesHandler previous) {
		this.fileName = fileName;
		try {
		
			
			this.props.putAll(previous);
			this.props = this.getProperties();
			previous.getProperties().putAll(this.props);
			if(this.props.getProperty(fileName+".include")!=null){
				Collection<String> includes = this.getPropertyAsCollection(fileName+".include");
				for(String include : includes)
				{
					PropertiesHandler extraProperties = new PropertiesHandler();
				
					extraProperties.setFileName(path, include, extension, previous);
					
				}
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setFileName(String fileName, PropertiesHandler previous) {
		this.fileName = fileName;
		try {
			
			
			this.props.putAll(previous);
			this.props = this.getProperties();
			previous.getProperties().putAll(this.props);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Collection<String> getPropertyAsCollection(String key){
		String propertyCollection = this.getProperty(key);
		Collection<String> stringCollection = new ArrayList<>();
		if(propertyCollection != null){
			String[] propertiesCollection = propertyCollection.split(",");
			
			for(String singleProperty : propertiesCollection){
				stringCollection.add(singleProperty);
			}
		}else{
			System.out.println("La property "+ key +" no existe.");
		}
		return stringCollection;
	}
	
}
