["select id,deleted,mod_date_time,mod_user_id,ver,add_date_time,add_user_id,del_date_time,del_user_id from t_prepare_s_k_id_adt_ver_full_entity where mod_date_time like ? and add_user_id in (?,?,?) and del_date_time between ? and ? limit 30 offset 0",["%1949-10-01%","1","a",",","1949-10-01","1996-07"]]
