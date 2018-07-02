package com.young.mvcwebdemo.web;

import com.young.mvcwebdemo.web.dao.UserRepo;
import com.young.mvcwebdemo.web.domian.User;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * Project: mvcweb-demo.
 * Author:YZX
 * Time:13:02 2018/6/3
 * Description:
 */

@Path("/king")
@Component
public class CustomerApi {


    @Autowired
    UserRepo userRepo;

    @Path("/export/{id}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public void info(@PathParam(value = "id") String id, @Context HttpServletResponse res) throws Exception {
        System.out.println("------->" + id);
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("今日报表sh1");
        HSSFRow row0 = sheet.createRow(0);
        row0.createCell(0).setCellValue("标题");
        row0.createCell(1).setCellValue("链接");
        row0.createCell(2).setCellValue("备注");


/*        File file = new File("C:\\Users\\YZX\\Desktop\\材料.txt");
        return Response.ok(file)
                .header("Content-Disposition",
                    "attachment; filename="+ URLEncoder.encode("商品.txt","utf-8"))
                .build();*/

        String fileName = "商品链接_"+new Date().toLocaleString();
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        workbook.write(os);
        byte[] content = os.toByteArray();
        InputStream is = new ByteArrayInputStream(content);
        res.reset();
        res.setContentType("application/vnd.ms-excel;charset=utf-8");
        res.setHeader("Content-Disposition", "attachment;filename="
                + new String((fileName + ".xls").getBytes(), "iso-8859-1"));
        ServletOutputStream output = res.getOutputStream();
        FileCopyUtils.copy(is,output);

    }


    private static Logger logger = LoggerFactory.getLogger(CustomerApi.class);

    @Path("/queryUser")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> queryList(){
        logger.info("hello!I am your logger!");
        List<User> all = userRepo.findAll();
        return all;
    }

}
