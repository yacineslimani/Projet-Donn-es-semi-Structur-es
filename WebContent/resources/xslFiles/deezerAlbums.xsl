<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<xsl:apply-templates select="root/data/album" /> 
	</xsl:template>
	
	<xsl:template match="root/data/album" >
		<album>			
			<author><xsl:apply-templates select="artist/name" /></author>
			<title><xsl:apply-templates select="title" /></title>	
		</album>						
	</xsl:template>
	
	<xsl:template match="artist/name" >
		<xsl:value-of select="current()"  />				
	</xsl:template>
	
	<xsl:template match="title" >
		<xsl:value-of select="current()"  />				
	</xsl:template>
	
	
</xsl:stylesheet>