  CREATE TABLE public."location" (
  	id serial4 NOT NULL,
  	bdas text NULL,
  	"name" text NULL,
  	location_id text NULL,
  	status text NULL,
  	bda_type text NULL,
  	country text NULL,
  	geo_type text NULL,
  	valid_to date NULL,
  	hulu_name text NULL,
  	latitude numeric NULL,
  	port_flag bool NULL,
  	time_zone text NULL,
  	longitude numeric NULL,
  	valid_from date NULL,
  	restricted bool NULL,
  	description text NULL,
  	dialing_code text NULL,
  	is_dusk_city bool NULL,
  	olson_timezone text NULL,
  	utc_offset_minutes int4 NULL,
  	workaround_reason text NULL,
  	daylight_saving_end date NULL,
  	daylight_saving_time time NULL,
  	daylight_saving_start date NULL,
  	postal_code_mandatory bool NULL,
  	dialing_code_description text NULL,
  	state_province_mandatory bool NULL,
  	daylight_saving_shift_minutes int4 NULL,
  	country_id int8 NULL,
  	hsud_name varchar(255) NULL,
  	is_maersk_city bool NULL,
  	CONSTRAINT location_pkey PRIMARY KEY (id)
  );
  CREATE TABLE public.location_alternate_code (
  	id serial4 NOT NULL,
  	location_id int4 NULL,
  	code text NULL,
  	code_type text NULL,
  	CONSTRAINT location_alternate_code_pkey PRIMARY KEY (id)
  );

  -- public.location_alternate_code foreign keys
  ALTER TABLE public.location_alternate_code ADD CONSTRAINT location_alternate_code_location_id_fkey FOREIGN KEY (location_id) REFERENCES public."location"(id);

  CREATE TABLE public.parent (
  	id serial4 NOT NULL,
  	location_id int4 NULL,
  	"name" text NULL,
  	"type" text NULL,
  	bda_type text NULL,
  	CONSTRAINT parent_pkey PRIMARY KEY (id)
  );


  -- public.parent foreign keys

  ALTER TABLE public.parent ADD CONSTRAINT parent_location_id_fkey FOREIGN KEY (location_id) REFERENCES public."location"(id);

  CREATE TABLE public.bda_location (
  	id serial4 NOT NULL,
  	location_id int4 NULL,
  	"name" text NULL,
  	"type" text NULL,
  	status text NULL,
  	bda_type varchar(255) NULL,
  	CONSTRAINT bda_location_pkey PRIMARY KEY (id)
  );

  -- public.bda_location foreign keys
  ALTER TABLE public.bda_location ADD CONSTRAINT bda_location_location_id_fkey FOREIGN KEY (location_id) REFERENCES public."location"(id);


  CREATE TABLE public.bda_location_alternate_code (
  	id serial4 NOT NULL,
  	bda_location_id int8 NOT NULL,
  	code varchar(255) NULL,
  	code_type varchar(255) NULL,
  	CONSTRAINT bda_location_alternate_code_pkey PRIMARY KEY (id)
  );


  -- public.bda_location_alternate_code foreign keys

  ALTER TABLE public.bda_location_alternate_code ADD CONSTRAINT bda_location_alternate_code_bda_location_id_fkey FOREIGN KEY (bda_location_id) REFERENCES public.bda_location(id);

  CREATE TABLE public.bda_alternate_code (
  	id serial4 NOT NULL,
  	bda_location_id int4 NULL,
  	code text NULL,
  	code_type text NULL,
  	CONSTRAINT bda_alternate_code_pkey PRIMARY KEY (id)
  );


  -- public.bda_alternate_code foreign keys

  ALTER TABLE public.bda_alternate_code ADD CONSTRAINT bda_alternate_code_bda_location_id_fkey FOREIGN KEY (bda_location_id) REFERENCES public.bda_location(id);

  CREATE TABLE public.alternate_code (
  	id serial4 NOT NULL,
  	parent_id int4 NULL,
  	code text NULL,
  	code_type text NULL,
  	CONSTRAINT alternate_code_pkey PRIMARY KEY (id)
  );


  -- public.alternate_code foreign keys
  ALTER TABLE public.alternate_code ADD CONSTRAINT alternate_code_parent_id_fkey FOREIGN KEY (parent_id) REFERENCES public.parent(id);
