["select id,invalid,mod_date_time,mod_user_id,ver,crt_date_time,crt_user_id,ivd_date_time,ivd_user_id from t_prepare_s_k_id_adt_ver_full_entity where invalid=? and mod_date_time like ? and crt_user_id in (?,?,?) and ivd_date_time between ? and ? limit 30 offset 0",["Y","%1949-10-01%","1","a",",","1949-10-01","1996-07"]]
