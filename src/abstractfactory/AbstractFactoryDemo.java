/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author Mr T.Khine
 */
abstract class ReportHeader
{
    abstract void genereateHeader();
}
abstract class ReportBody
{
    abstract void generateBody();
}
abstract class ReportFactory
{
    abstract ReportHeader createHeader();
    abstract ReportBody createBody();
}
class HTMLReportHeader extends ReportHeader
{

    @Override
    void genereateHeader() {
        System.out.println("HTML report header");
    }
 }
class HTMLReportBody extends ReportBody
{

    @Override
    void generateBody() {
        System.out.println("HTML report body");
    }
    
}
class PDFReportHeader extends ReportHeader
{
    @Override
    void genereateHeader() {
        System.out.println("PDF report header");
    }
    
}
class PDFReportBody extends ReportBody
{

    @Override
    void generateBody() {
        System.out.println("PDF report body");
    }
}
class HTMLReportFactory extends ReportFactory
{

    @Override
    ReportHeader createHeader() {
        return new HTMLReportHeader();
    }

    @Override
    ReportBody createBody() {
        return new HTMLReportBody();
    }
}
class PDFReportFactory extends ReportFactory
{
     @Override
    ReportHeader createHeader() {
        return new PDFReportHeader();
    }

    @Override
    ReportBody createBody() {
        return new PDFReportBody();
    }
}
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        ReportFactory fac = new PDFReportFactory();
        ReportHeader header = fac.createHeader();
        ReportBody body = fac.createBody();
        
        header.genereateHeader();
        body.generateBody();
        
        
    }
}
