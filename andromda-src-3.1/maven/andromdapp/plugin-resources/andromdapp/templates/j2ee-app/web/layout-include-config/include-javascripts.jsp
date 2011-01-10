<%@ page session="false" %>

<%
pageContext.setAttribute("layout",
org.andromda.presentation.bpm4struts.LayoutConfiguration.instance().getLayoutConfiguration());
%>

<!-- 
Adicionar javascript usando o seguinte formato:
<script type="text/javascript" language="Javascript1.1" src="/contexto/layout/${layout}/<nome_arquivo>.js"></script>
-->

<script type="text/javascript" language="Javascript1.1" src="/${projectId}/layout/${layout}/javaScripts/dimmingdiv.js"></script>
<script type="text/javascript" language="Javascript1.1" src="/${projectId}/layout/${layout}/javaScripts/layout-common.js"></script>
<script type="text/javascript" language="Javascript1.1" src="/${projectId}/layout/${layout}/javaScripts/key-events.js"></script>
<script type="text/javascript" language="Javascript1.1" src="/${projectId}/layout/${layout}/javaScripts/scripts.js"></script>
<script type="text/javascript" language="Javascript1.1" src="/${projectId}/layout/${layout}/javaScripts/hints.js"></script>


