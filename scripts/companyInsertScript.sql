
INSERT INTO public.company(
             created_by, created_time, modified_by, modified_time, 
            code, description, name)
    VALUES ( 1, CURRENT_TIMESTAMP, null, null, 
            'gs', 'gospace site', 'gospace'),
            ( 1, CURRENT_TIMESTAMP, null, null, 
            'fs', 'foose web', 'foose'),
            ( 1, CURRENT_TIMESTAMP, null, null, 
            'ws', 'workspace website', 'workspace'),
            ( 1, CURRENT_TIMESTAMP, null, null, 
            'cms', 'content management system', 'cms');
