package ke.co.mspace.ClientManager.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import ke.co.mspace.ClientManager.dto.UserDTO;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "tUSER")
@DynamicInsert
@DynamicUpdate
public class User {
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;


//    @Setter(AccessLevel.NONE)
        @Column(name = "agent")

    private String agent;

    @Column(name = "max_daily")
    private Integer max_daily;

    @Column(name = "max_weekly")
    private Integer max_weekly;

    @Column(name = "max_monthly")
    private Integer max_monthly;
        @Column(name = "max_total")
    private Integer max_total;

    @Column(name = "max_total_amt")
    private Integer max_total_amt;

    @Column(name = "logged_in")
    private Integer logged_in;

    @Column(name = "logged_in_time")
    private Date logged_in_time;

    @Column(name = "msg")
    private String msg;

    @Column(name = "destination_addr")
    private String destination_addr;

    @Column(name = "admin")
    private String admin;

    @Column(name = "start_date")
    private Date start_date;
    @Column(name = "end_date")
    private Date end_date;

    @Column(name = "last_received_id")
    private Integer last_received_id;

    @Column(name = "last_sent_id")
    private Integer last_send_id;

    @Column(name = "sms_count_today")
    private Integer sms_count_today;

    @Column(name = "sms_count_week")
    private Integer sms_count_week;

    @Column(name = "sms_count_total")
    private Integer sms_count_total;

    @Column(name = "received_month")
    private Integer received_month;

    @Column(name = "received_week")
    private Integer received_week;

    @Column(name = "received_today")
    private Integer received_today;

    @Column(name = "name")
    private String name;

    @Column(name = "contact_number")
    private String contact_number;

    @Column(name = "contract_num")
    private String contract_num;

    @Column(name = "staff_no")
    private String staff_no;

    @Column(name = "firstname")
    private String firstname;


    @Column(name = "surname")
    private String surname;


    @Column(name = "department_no")
    private Integer department_no;

    @Column(name = "job_title_no")
    private Integer job_title_no;

    @Column(name = "sms_count_month")
    private Integer sms_count_month;

    @Column(name = "reports_to")
    private String reports_no;

    @Column(name = "email_address")
    private String email_address;

    @Column(name = "marketing_email")
    private String marketing_email;

    @Column(name = "notes")
    private String notes;

    @Column(name = "user_id")
    private String user_id;

    @Column(name = "date_updated")
    private Date date_updated;

    @Column(name = "taskadmin")
    private String taskadmin;

    @Column(name = "organization")
    private String organization;

    @Column(name = "enable_email_alert")
    private Integer enable_email_alert;

    @Column(name = "alertThreshold")
    private Integer alertThreshold;

    @Column(name = "alerted")
    private Integer alerted;

    @Column(name = "super_account_id")
    private Integer super_account_id;

    @Column(name = "arrears")
    private Integer arrears;

    @Column(name = "cost_per_sms")
    private Integer cost_per_sms;

    @Column(name = "short_codes")
    private String short_codes;

    @Column(name = "verifiedEmail")
    private Integer verifiedEmail;

    @Column(name = "renewalDate")
    private Date renewalDate;

    @Column(name = "creationDate")
    private Date creationDate;

    @Column(name = "accType")
    private Integer accType;

    @Column(name = "max_contacts")
    private Integer max_contacts;

    @Column(name = "off")
    private Integer off;

    @Column(name = "phoneNo")
    private String phoneNo;

    @Column(name = "mobileNo")
    private String mobileNo;

    @Column(name = "superadmin")
    private Integer superadmin;

}
