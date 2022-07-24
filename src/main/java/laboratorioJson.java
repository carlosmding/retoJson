import com.google.gson.*;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class laboratorioJson {
    public static int PRETTY_PRINT_IDENT_FACTOR= 4;
    public static String XML_STRING =
            "<?xml version=\"1.0\"?>\n" +
                    "<?mso-application progid=\"Excel.Sheet\"?>\n" +
                    "<Workbook xmlns=\"urn:schemas-microsoft-com:office:spreadsheet\"\n" +
                    " xmlns:o=\"urn:schemas-microsoft-com:office:office\"\n" +
                    " xmlns:x=\"urn:schemas-microsoft-com:office:excel\"\n" +
                    " xmlns:ss=\"urn:schemas-microsoft-com:office:spreadsheet\"\n" +
                    " xmlns:html=\"http://www.w3.org/TR/REC-html40\">\n" +
                    " <DocumentProperties xmlns=\"urn:schemas-microsoft-com:office:office\">\n" +
                    "  <LastAuthor>carlo</LastAuthor>\n" +
                    "  <Created>2022-07-24T13:45:45Z</Created>\n" +
                    "  <Version>16.00</Version>\n" +
                    " </DocumentProperties>\n" +
                    " <OfficeDocumentSettings xmlns=\"urn:schemas-microsoft-com:office:office\">\n" +
                    "  <AllowPNG/>\n" +
                    " </OfficeDocumentSettings>\n" +
                    " <ExcelWorkbook xmlns=\"urn:schemas-microsoft-com:office:excel\">\n" +
                    "  <WindowHeight>10404</WindowHeight>\n" +
                    "  <WindowWidth>23040</WindowWidth>\n" +
                    "  <WindowTopX>32767</WindowTopX>\n" +
                    "  <WindowTopY>32767</WindowTopY>\n" +
                    "  <ProtectStructure>False</ProtectStructure>\n" +
                    "  <ProtectWindows>False</ProtectWindows>\n" +
                    " </ExcelWorkbook>\n" +
                    " <Styles>\n" +
                    "  <Style ss:ID=\"Default\" ss:Name=\"Normal\">\n" +
                    "   <Alignment ss:Vertical=\"Bottom\"/>\n" +
                    "   <Borders/>\n" +
                    "   <Font ss:FontName=\"Calibri\" x:Family=\"Swiss\" ss:Size=\"11\" ss:Color=\"#000000\"/>\n" +
                    "   <Interior/>\n" +
                    "   <NumberFormat/>\n" +
                    "   <Protection/>\n" +
                    "  </Style>\n" +
                    "  <Style ss:ID=\"s62\">\n" +
                    "   <NumberFormat ss:Format=\"Short Date\"/>\n" +
                    "  </Style>\n" +
                    " </Styles>\n" +
                    " <Worksheet ss:Name=\"xml2csv\">\n" +
                    "  <Table ss:ExpandedColumnCount=\"2\" ss:ExpandedRowCount=\"15\" x:FullColumns=\"1\"\n" +
                    "   x:FullRows=\"1\" ss:DefaultRowHeight=\"14.4\">\n" +
                    "   <Column ss:Index=\"2\" ss:Width=\"69\"/>\n" +
                    "   <Row>\n" +
                    "    <Cell><Data ss:Type=\"String\">nombre</Data></Cell>\n" +
                    "    <Cell><Data ss:Type=\"String\">Juan Fernando</Data></Cell>\n" +
                    "   </Row>\n" +
                    "   <Row>\n" +
                    "    <Cell><Data ss:Type=\"String\">apellido</Data></Cell>\n" +
                    "    <Cell><Data ss:Type=\"String\">Correa</Data></Cell>\n" +
                    "   </Row>\n" +
                    "   <Row>\n" +
                    "    <Cell><Data ss:Type=\"String\">nacimiento</Data></Cell>\n" +
                    "    <Cell ss:StyleID=\"s62\"><Data ss:Type=\"DateTime\">1980-02-01T00:00:00.000</Data></Cell>\n" +
                    "   </Row>\n" +
                    "   <Row>\n" +
                    "    <Cell><Data ss:Type=\"String\">nivel</Data></Cell>\n" +
                    "    <Cell><Data ss:Type=\"Number\">7</Data></Cell>\n" +
                    "   </Row>\n" +
                    "   <Row>\n" +
                    "    <Cell><Data ss:Type=\"String\">sede</Data></Cell>\n" +
                    "    <Cell><Data ss:Type=\"String\">Sur Oeste</Data></Cell>\n" +
                    "   </Row>\n" +
                    "   <Row>\n" +
                    "    <Cell><Data ss:Type=\"String\">nombre</Data></Cell>\n" +
                    "    <Cell><Data ss:Type=\"String\">Tina</Data></Cell>\n" +
                    "   </Row>\n" +
                    "   <Row>\n" +
                    "    <Cell><Data ss:Type=\"String\">apellido</Data></Cell>\n" +
                    "    <Cell><Data ss:Type=\"String\">Garcia</Data></Cell>\n" +
                    "   </Row>\n" +
                    "   <Row>\n" +
                    "    <Cell><Data ss:Type=\"String\">nacimiento</Data></Cell>\n" +
                    "    <Cell ss:StyleID=\"s62\"><Data ss:Type=\"DateTime\">1982-02-01T00:00:00.000</Data></Cell>\n" +
                    "   </Row>\n" +
                    "   <Row>\n" +
                    "    <Cell><Data ss:Type=\"String\">nivel</Data></Cell>\n" +
                    "    <Cell><Data ss:Type=\"Number\">5</Data></Cell>\n" +
                    "   </Row>\n" +
                    "   <Row>\n" +
                    "    <Cell><Data ss:Type=\"String\">sede</Data></Cell>\n" +
                    "    <Cell><Data ss:Type=\"String\">Oriente</Data></Cell>\n" +
                    "   </Row>\n" +
                    "   <Row>\n" +
                    "    <Cell><Data ss:Type=\"String\">nombre</Data></Cell>\n" +
                    "    <Cell><Data ss:Type=\"String\">Sebastian</Data></Cell>\n" +
                    "   </Row>\n" +
                    "   <Row>\n" +
                    "    <Cell><Data ss:Type=\"String\">apellido</Data></Cell>\n" +
                    "    <Cell><Data ss:Type=\"String\">Gomez</Data></Cell>\n" +
                    "   </Row>\n" +
                    "   <Row>\n" +
                    "    <Cell><Data ss:Type=\"String\">nacimiento</Data></Cell>\n" +
                    "    <Cell ss:StyleID=\"s62\"><Data ss:Type=\"DateTime\">1986-02-02T00:00:00.000</Data></Cell>\n" +
                    "   </Row>\n" +
                    "   <Row>\n" +
                    "    <Cell><Data ss:Type=\"String\">nivel</Data></Cell>\n" +
                    "    <Cell><Data ss:Type=\"Number\">9</Data></Cell>\n" +
                    "   </Row>\n" +
                    "   <Row>\n" +
                    "    <Cell><Data ss:Type=\"String\">sede</Data></Cell>\n" +
                    "    <Cell><Data ss:Type=\"String\">Medellin</Data></Cell>\n" +
                    "   </Row>\n" +
                    "  </Table>\n" +
                    "  <WorksheetOptions xmlns=\"urn:schemas-microsoft-com:office:excel\">\n" +
                    "   <PageSetup>\n" +
                    "    <Header x:Margin=\"0.3\"/>\n" +
                    "    <Footer x:Margin=\"0.3\"/>\n" +
                    "    <PageMargins x:Bottom=\"0.75\" x:Left=\"0.7\" x:Right=\"0.7\" x:Top=\"0.75\"/>\n" +
                    "   </PageSetup>\n" +
                    "   <Selected/>\n" +
                    "   <ProtectObjects>False</ProtectObjects>\n" +
                    "   <ProtectScenarios>False</ProtectScenarios>\n" +
                    "  </WorksheetOptions>\n" +
                    " </Worksheet>\n" +
                    "</Workbook>";


    public static void main(String[] args) {
        try {
            JSONObject jsonobject = XML.toJSONObject(XML_STRING);
            String jsonPretty = jsonobject.toString(PRETTY_PRINT_IDENT_FACTOR);
            System.out.println(jsonPretty);
            System.out.println(">>> Verificación de correcto funcionamiento ");
        } catch (JSONException jex){
            System.out.println(jex.toString());
        }
    }
}




