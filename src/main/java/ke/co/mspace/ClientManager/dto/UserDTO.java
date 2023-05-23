package ke.co.mspace.ClientManager.dto;

import jakarta.annotation.Nullable;
import lombok.Builder;
import lombok.Data;

import java.sql.Date;
@Data
@Builder
public class UserDTO {


    private Integer id;
    private String username;
    private String password;
    private String agent;
    private Integer max_daily;
    private Integer max_weekly;
    private Integer max_monthly;
    private Integer max_total;
    private Integer max_total_amt;
    private Integer logged_in;
    private Date logged_in_time;

    private String msg;

    private String destination_addr;

    private String admin;
    private Date start_date;
    private Date end_date;
    private Integer last_received_id;
    private Integer last_send_id;
    private Integer sms_count_today;

    private Integer sms_count_week;
    private Integer sms_count_total;
    private  Integer received_month;
    private  Integer received_week;
    private Integer received_today;

    private  String name;
    private  String contact_number;
    private String contract_num;

    private String staff_no;
    private String firstname;

    private String surname;

    private Integer department_no;

    private Integer job_title_no;

    private Integer sms_count_month;

    private String reports_no;

    private String email_address;
    private  String marketing_email;
    private String notes;
    private String user_id;
    private Date date_updated;

    private String organization;
    @Nullable
    private boolean enable_email_alert;
    private Integer alertThreshold;
    private Integer alerted;
    private Integer super_account_id;
    private Integer arrears;
    private  Integer cost_per_sms;
    private String short_codes;
    private Integer verifiedEmail;
    private  Date renewalDate;
    private  Date creationDate;
    private Integer accType;
    private  Integer max_contacts;
    private Integer off;
    private  String phoneNo;
    private  String mobileNo;
    private Integer superadmin;

}
