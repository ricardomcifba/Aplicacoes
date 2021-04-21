/**
 * Author:  Rick
 * Created: 12/03/2018
 */
copy(
    select * from queries.view_amf_indicacao_matriculas_trabalhar
	 where  localidade in (select localidades(@superintendencia))
	 and tipo_servico_recomendado in (@servico)
	 limit 1
)
to '\\@server\tmp\imt\@file.csv' delimiter ';'
 CSV HEADER null '' 
ENCODING 'utf8'